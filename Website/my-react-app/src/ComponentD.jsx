import React, { useContext } from 'react';
import { userContext } from './ComponentA';

function ComponentD() {
    // Nhận dữ liệu từ context
    const user = useContext(userContext);

    return (
        <div className="box">
            <h1>Hello {user}</h1>
        </div>
    );
}

export default ComponentD;