function ButtonDot(){
    // nen dung ham arrowfunction de tranh gap loi khi ma cha kich thi bi goi ham trong console
    const handleClick = (e) =>{console.log(e)} 
    let count = 0;
    const handleClick2 = (name) => {
        if(count < 3){
            count++;
            console.log(`hello ${count}`)
        }
        else{
            console.log("nice try")
        }
    };
    return(
        <button onClick={(e) => handleClick(e)}>Click me</button>
    );
}
export default ButtonDot