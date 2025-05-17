import test from "./assets/test.png"
function Card() {
    return (
        <div className="card">
            <img className="card-image" src={test} alt="profile picture" />
            <h2 className="card-title">BroCode</h2>
            <p className="card-text">Test code </p>
        </div>
    );
}
export default Card