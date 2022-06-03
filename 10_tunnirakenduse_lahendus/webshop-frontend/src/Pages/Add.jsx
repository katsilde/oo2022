function Add(){
    function addProduct(){
        fetch("http:/localhost:8080/products", {
            method: "POST",
            body: JSON.stringify({name: "Coca cola", price: 3})
        });
    }
    
    return (<div>
        <button onClick={() => addProduct()}>lisa</button>
    </div>)
}
export default Add;
