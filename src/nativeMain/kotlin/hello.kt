import kotlinx.coroutines.*
import platform.posix.sleep

fun main() = runBlocking {
    var i = 0
    while(true){
        println("Hello Kotlin/Native COROUTINE #${++i}")
        sleep(2)
    }
}