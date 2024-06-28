package functions

class Request(val method: String, val query: String, val contentType: String)

class Response(var contents: String, var status: Status) {
    fun status(status: Status.() -> Unit) {
        // implementation
    }
}

class  Status(var code: Int, var description: String)

fun response(response: Response.() -> Unit) {}

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false

    fun next() {
        executeNext = true
    }
}

fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main(args: Array<String>) {
    routeHandler("/index.html") {
        if (request.query != "") {
            // process
        }
        response {
            status {
                code = 404
                description = "Not found"
            }
        }
    }
}