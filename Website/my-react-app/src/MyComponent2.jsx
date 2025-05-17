import { useState } from "react";

function MyComponent2() {
  const [car, setCar] = useState([]);
  const [carYear, setCarYear] = useState(new Date().getFullYear());
  const [carMake, setCarMake] = useState("");
  const [carModel, setCarModel] = useState("");

  function handleAddCar() {
    const newCar = { year: carYear, make: carMake, model: carModel };
    setCar(prevCars => [...prevCars, newCar]);
  }

  function handleRemoveCar(indexToRemove) {
    setCar(prevCars => prevCars.filter((_, index) => index !== indexToRemove));
  }

  function handleYearChange(event) {
    setCarYear(event.target.value);
  }

  function handleMakeChange(event) {
    setCarMake(event.target.value);
  }

  function handleModelChange(event) {
    setCarModel(event.target.value);
  }

  return (
    <div>
      <h2>List of car objects</h2>
      <ul>
        {car.map((c, index) => (
          <li key={index}>
            {c.year}, {c.make}, {c.model}{" "}
            <button onClick={() => handleRemoveCar(index)}>Remove</button>
          </li>
        ))}
      </ul>
      <input
        type="number"
        value={carYear}
        onChange={handleYearChange}
        placeholder="Year"
      />
      <input
        type="text"
        value={carMake}
        onChange={handleMakeChange}
        placeholder="Make"
      />
      <input
        type="text"
        value={carModel}
        onChange={handleModelChange}
        placeholder="Model"
      />
      <button onClick={handleAddCar}>Add Car</button>
    </div>
  );
}

export default MyComponent2;