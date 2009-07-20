class BootStrap {

     def init = { servletContext ->
	
		new PopulateData().fillData()

     }
     def destroy = {
     }
} 