/** FUNCTIONAL **/

/**
 * @param {String} e element
 * @return element as Object
 */
function $(e){
    return document.querySelector(e)
}

/**
 * @param {Number} min min
 * @param {Number} max max 
 * @return random number
 */
function random(min = 0, max = 1){
    return Math.floor((Math.random() * max) + min)
}


class Password {


    /** SMALL CONSTRUCTORS **/

    constructor(length = 8){
        this.length = length;
        this.password = "";
    }


    /** REST **/

    generate(){
        const chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (let i = 0; i < this.length; i++)
            this.password += chars.charAt(random(0, chars.length))
        
        return this.password;
    }
}


/** EVENTS **/

$("#passForm").addEventListener("submit", e => {
    const size = $("input[name='size']").value;
    const output = $("#password");
    const password = new Password(size).generate();

    output.setAttribute("style", "");//Displays
    output.innerHTML = password;//Display password
})