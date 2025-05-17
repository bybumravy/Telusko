import { element } from 'prop-types';
import React, { useState } from 'react';

function MyComponent() {
    const [name, setName] = useState(); // Khởi tạo state `name` với giá trị mặc định là undefined
    const [payment, setPayMent] = useState()
    const [shipping, setShipping] = useState()
    function handleNameChange(event) {
        setName(event.target.value)
    }
    function handlePaymentChange(event) {
        setPayMent(event.target.value)
    }
    function handleShipping(event) {
        setShipping(event.target.value)
    }
    const [count, setCount] = useState(0)
    function handleCount(event) {
        setCount(c => c + 1)
    }
    const [car, setCar] = useState({ year: 2024, make: "food", model: "lol" });
    function handleYear(event) {
        setCar(c => ({ ...c, year: event.target.value }))
    }
    function handleMake(event) {
        setCar(c => ({ ...c, make: event.target.value }))
    }
    function handleModel(event) {
        setCar(c => ({ ...c, model: event.target.value }))
    }
    const [food, setFood] = useState(["Apple", "Orange", "banana"])
    function handleAddFood() {
        const newFood = document.getElementById("FoodID").value;
        setFood(prevFood => [...prevFood, newFood]);
    }
    function handleRemoveFood(indexToRemove) {
        setFood(prevFood => prevFood.filter((_, index) => index !== indexToRemove));
    }
    
    return (
        <div>
            <input value={payment} onChange={handlePaymentChange}></input>
            <p>payment : {payment}</p>
            <select value={payment} onChange={handlePaymentChange}>
                <option value="Visa">visa</option>
                <option value="Vif">vuf</option>
                <option value="ok">ok</option>
            </select>
            <label>
                Pick up
                <input type="radio" value="Pick up" checked={shipping === "Pick up"} onChange={handleShipping}></input>
            </label>
            <label>Deleivery
                <input type="radio" value="Deleivery" checked={shipping === "Deleivery"} onChange={handleShipping}></input>
            </label>
            <p>Shipping : {shipping}</p>
            <button onClick={handleCount}>ClickCount</button>
            <p>Count : {count}</p>




            <p> Car : {car.year},{car.make},{car.model}</p>
            <input type="number" value={car.year} onChange={handleYear} ></input>
            <input type="String" value={car.make} onChange={handleMake}></input>
            <input type="String" value={car.model} onChange={handleModel}></input>

            <h1>List of foods</h1>
            <ul>
                {food.map((foodList, index) => (
                    <li key={index} onClick={() => handleRemoveFood(index)}>{foodList}</li>
                ))}
            </ul>
            <input type="String" placeholder="Enter food name" id="FoodID"></input>
            <button onClick={handleAddFood}>Add food</button>
        </div>
    );
}

export default MyComponent;