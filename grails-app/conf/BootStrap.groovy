class BootStrap {

    def authenticateService

    def init = { servletContext ->

        new PopulateData().fillData(authenticateService)

    }

    def destroy = {
    }
}

