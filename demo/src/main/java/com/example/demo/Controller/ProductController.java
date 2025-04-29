package com.example.demo.Controller;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  // Sử dụng @Controller thay vì @RestController
import org.springframework.ui.Model;  // Sử dụng Model để truyền dữ liệu vào trang HTML
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.example.demo.Model.Product;
import com.example.demo.Model.ProductDTO;
import com.example.demo.Service.ProductService;

@Controller
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping
    public String greet() {
        return "hello";
    }

    @RequestMapping("/product")
    public List<Product> getProudct() {
        return service.getProducts();
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product) {
        service.updateProduct(product);
    }

    @DeleteMapping("/product/{proID}") // Đã sửa lại tên endpoint
    public void removeProduct(@PathVariable int proID) {
        service.deleteProduct(proID);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        Product product = service.getProductByID(id);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@ModelAttribute Product product, @RequestParam("image") MultipartFile image) {
        try {
            Product pro1 = service.addProduct(product, image);
            return new ResponseEntity<>(pro1, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace(); // In lỗi chi tiết
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{proID}")
    public String getProductById(@PathVariable int proID, Model model) {
        Product pro = service.getProductByID(proID);

        if (pro == null) {
            model.addAttribute("error", "Product not found");
            return "errorPage"; // Bạn có thể tạo một trang error nếu không tìm thấy sản phẩm
        }

        ProductDTO dto = new ProductDTO();
        dto.setId(pro.getId());
        dto.setName(pro.getName());
        dto.setBrand(pro.getBrand());
        dto.setPrice(pro.getPrice());
        dto.setCategory(pro.getCategory());
        dto.setReleaseDate(pro.getReleaseDate() != null ? pro.getReleaseDate().toString() : null);
        dto.setAvailable(pro.isAvailable());
        dto.setQuantity(pro.getQuantity());
        dto.setImageName(pro.getImageName());
        dto.setImageType(pro.getImageType());

        // Convert image bytes -> base64 string
        if (pro.getImageDate() != null) {
            String base64Image = Base64.getEncoder().encodeToString(pro.getImageDate());
            dto.setImageBase64(base64Image);
        }

        model.addAttribute("product", dto);  // Truyền dữ liệu vào Model
        return "display"; // Trả về tên trang HTML (display.html)
    }
}