package dependencyInversion

class BadSystem {

    private val download:DownloadService = DownloadService()
    private  val upload:UploadService = UploadService()

    init {
        download.onServiceInit()
        upload.onServiceInit()
    }

    fun saveToDisk(file:String,Dir:String){
        download.save(file,Dir)
    }

    fun saveToDB(file:String,URL:String){
        upload.save(file,URL)
    }
}