function generatePassword(length, includeLowercase, includeUppercase, includeNumbers, includeSymbols){
    const lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
    const uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const numberChars = "0123456789";
    const symbolChars = "!@#$%^&*()_+ -= ";

    let allowedchars = "";
    let password = "";

    allowedchars += includeLowercase ? lowercaseChars : "";
    allowedchars += includeUppercase ? uppercaseChars : "";
    allowedchars += includeNumbers ? numberChars : "";
    allowedchars += includeSymbols ? symbolChars : "";

    if(length <= 0){
        return `(password length must be at least 1)` ;
    }

    if(allowedchars.length === 0){
        return `(At least 1 set of character needs to be selected)`;
    }

    for(let i = 0; i < length; i++){
        const randomIndex = Math. floor(Math.random() * allowedchars.length);
        password += allowedchars[randomIndex]
    }
    return password;
}

const passwordLength = 12;
const includeLowercase = true;
const includeUppercase = true;
const includeNumbers = true;
const includeSymbols = true;

const password = generatePassword(passwordLength,includeLowercase,includeUppercase,includeNumbers,includeSymbols);
    
console.log(`Generated password: ${password}`);