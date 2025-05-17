//List.js
function List(props) {
    const itemList = props.items; // Lấy danh sách các items (hoa quả hoặc rau củ)
    const category = props.category; // Lấy tên danh mục (hoa quả hoặc rau củ)

    // Map items thành các phần tử li
    const listItems = itemList.map(item => (
        <li key={item.id}>
            {item.name} - {item.calary} cal {/* Hiển thị calary */}
        </li>
    ));

    return (
        <>
            <h1>{category}</h1> {/* Hiển thị tên danh mục */}
            <ul>{listItems}</ul> {/* Render các phần tử danh sách */}
        </>
    );
}

// Thiết lập giá trị mặc định cho category nếu không được truyền vào
List.defaultProps = {
    category: "Category"
};

export default List;