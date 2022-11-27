package dependencyInversion

interface Service {
    fun onServiceInit()
    fun save(file: String,dest:String)
}

class UploadService:Service {
    override fun onServiceInit() {
        println("Upload service ready!")
    }

    override fun save(file:String, dest:String ) {
        println("$file has been uploaded to $dest")

    }
}
class DownloadService:Service{
    override fun onServiceInit() {
        println("Download service ready!")
    }

    override fun save(file:String, dest:String) {
        println("$file has been downloaded to $dest")
    }

}