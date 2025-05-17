import { useState,useEffect } from "react";

function MyComponentEffect(){
    const [count,setCount] = useState(0);
    const [color,setColor] = useState("green")
    useEffect(() => {
        document.title = `Count : ${count} ${color}`;
        console.log("hello safsfsa")
    },[count,color])
    function addCount(){
        setCount(c => c+1)
    }
    function subTractCount(){
        setCount(c => c-1)
    }
    function ChangeColor(){
        setColor(c => c==="green" ? "red" : "green")
    }
    return(
        <>
            <p style={{color :color}}>Count : {count}</p>
            <button onClick={addCount}>addCount</button>
            <button onClick={subTractCount}>SubTrackCount</button>
            <button onClick={ChangeColor}>ChangeColor</button>
        </>
    );
}
export default MyComponentEffect