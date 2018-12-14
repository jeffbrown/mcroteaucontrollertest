package mcroteaucontrollertest

class DemoController {

    static allowedMethods = [index: 'GET']

    def index() {
        render 'Success'
    }
}
