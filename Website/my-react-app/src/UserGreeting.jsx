import PropTypes from "prop-types";
function UserGreeting(props){
    if(props.isLogin){
        return(
            <h2>Welcome {props.userName}</h2>
        );
    }
}
UserGreeting.prototype = {
    isLogin : PropTypes.bool,

}
export default UserGreeting