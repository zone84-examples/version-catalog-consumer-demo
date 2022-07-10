import mu.KLogging

object Application : KLogging() {
    @JvmStatic
    fun main(args: Array<String>) {
        logger.info { "Hi, universe!" }
    }
}
