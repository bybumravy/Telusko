import React, { useEffect, useRef, useState } from "react";
import './StopWatch.css';

function StopWatch() {
  const [isRunning, setIsRunning] = useState(false);
  const [elapsedTime, setElapsedTime] = useState(0);
  const interval = useRef(null);
  const startTimeRef = useRef(0);

  useEffect(() => {
    if (isRunning) {
      interval.current = setInterval(() => {
   
        setElapsedTime(Date.now() - startTimeRef.current);
       
      }, 10);
    }
    return () => {
      clearInterval(interval.current);
    };
  }, [isRunning]);

  function start() {
    setIsRunning(true);
    startTimeRef.current = Date.now() - elapsedTime;
  }

  function stop() {
    setIsRunning(false);
  }

  function reset() {
    setIsRunning(false);
    setElapsedTime(0);
  }

  function formatTime(ms) {
    const totalCs = Math.floor(ms / 10);
    const cs = totalCs % 100;
    const totalSec = Math.floor(totalCs / 100);
    const s = totalSec % 60;
    const m = Math.floor(totalSec / 60);

    const pad = n => n.toString().padStart(2, "0");
    return `${pad(m)}:${pad(s)}:${pad(cs)}`;
  }

  return (
    <div className="stopwatch">
      <div className="display">{formatTime(elapsedTime)}</div>
      <div className="controls">
        <button onClick={start} className="start-button">Start</button>
        <button onClick={stop} className="stop-button">Stop</button>
        <button onClick={reset} className="reset-button">Reset</button>
      </div>
    </div>
  );
}

export default StopWatch;