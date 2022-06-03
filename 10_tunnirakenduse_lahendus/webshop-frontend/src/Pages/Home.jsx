import { useEffect, useState } from "react";
function Home(){
    const [products,setProducts] = useState([]); 

    useEffect(()=>{
        fetch("http:/localhost:8080/products")
        .then(response => response.json())
        .then(body => setProducts(body));

    },[]);

    return (
        products.map( element =>
        <div>
            <div>{element.name}</div>
            <div>{element.price}</div>
        </div>)
    )
}
export default Home;
