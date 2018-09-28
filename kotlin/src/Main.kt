import org.w3c.dom.Element
import kotlin.browser.document

/**
 * Created by alejandrorioscalera
 * On 28/9/18
 *
 * -- SOCIAL NETWORKS --
 *
 * GitHub: https://github.com/clonalejandro or @clonalejandro
 * Website: https://clonalejandro.me/
 * Twitter: https://twitter.com/clonalejandro11/ or @clonalejandro11
 * Keybase: https://keybase.io/clonalejandro/
 *
 * -- LICENSE --
 *
 * All rights reserved for clonalejandro ©password-generator 2017 / 2018
 */


fun main(args: Array<String>) {
    App()
    registerListeners()
}


/**
 * This function translates querySelector
 * @param e element
 */
fun j(e: String): Element {
    return document.querySelector(e)!!
}


/**
 * This function register the listeners
 */
fun registerListeners(){
    j("#passForm").addEventListener("submit", ({
        val size: Int = j("input[name='size']").getAttribute("value")!!.toInt()
        val output: Element = j("#password")
        val password: String = App(size).generate()

        output.setAttribute("style", "")//Displays
        output.innerHTML = password//Display the password
    }))
}


