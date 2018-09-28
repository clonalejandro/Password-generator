import kotlin.js.Math.random
import kotlin.properties.Delegates

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

class App(length: Int = 8) {


    /** SMALL CONSTRUCTORS **/

    private var length: Int by Delegates.notNull()
    private var password: String by Delegates.notNull()

    init {
        this.length = length
        this.password = ""
    }


    /** REST **/

    /**
     * This function generate & returns a random password
     * @return password
     */
    fun generate(): String {
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

        for (i in 0..this.length)
            this.password += chars[
                    rand(0, chars.length)
            ]

        return this.password
    }


    /** OTHERS **/

    /**
     * This function returns a random number
     * @param min min
     * @param max max
     * @return random random
     */
    private fun rand(min: Int = 0, max: Int = 1): Int {
        return ((random() * max) + min).toInt()
    }


}