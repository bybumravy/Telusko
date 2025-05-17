import React, { useState, createContext } from 'react';
import ComponentD from './ComponentD';

// Tạo Context
export const userContext = createContext();

function ComponentA() {
    const [user, setUser] = useState("BroCode");

    return (
        <div className="box">
            <h1>Hello ComponentA</h1>
            <h2>Hello: {user}</h2>

            <userContext.Provider value={user}>
                <ComponentD />
            </userContext.Provider>
        </div>
    );
}

export default ComponentA;