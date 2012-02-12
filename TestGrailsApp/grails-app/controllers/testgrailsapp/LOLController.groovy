package testgrailsapp

class LOLController {

    def index() {
		def i = Math.random();
		
		if (i < 0.5) 
			render "Hello";
		else
			render "Goodbye";
		}
	
	def list() {
		render "List something"
	}
}
