package dependencyInversion


class System(downloadService: DownloadService, uploadService:UploadService) {

    private val download:DownloadService
    private  val upload:UploadService


    init {
        download = downloadService
        download.onServiceInit()

        upload = uploadService
        upload.onServiceInit()
    }

    fun saveToDisk(file:String,Dir:String){
        download.save(file,Dir)
    }

    fun saveToDB(file:String,URL:String){
        upload.save(file,URL)
    }
}