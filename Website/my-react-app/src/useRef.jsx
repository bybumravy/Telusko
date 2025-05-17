import { useState, useRef } from "react";

function MyUseRefComponent() {
   const [number,setNumber] = useState(0)
   function handleClick(){
    setNumber(n => n+1)
   }
   return(
    <button onClick={handleClick}>Click me</button>
   );
}

export default MyUseRefComponent;