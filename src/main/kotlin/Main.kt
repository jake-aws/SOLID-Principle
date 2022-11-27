import dependencyInversion.*


fun main() {

    val url:String = "Https://CloudStorage.com"
    val dir:String = "C:\\Users\\jake\\Downloads"
    val file:String = "Item.fileType"

//    Dependency Injection
    val uploadService:UploadService= UploadService()
    val downloadService:DownloadService= DownloadService()
    val system:System = dependencyInversion.System(downloadService, uploadService)
    system.saveToDB(file, url)
    system.saveToDisk(file, dir)

//    Without Dependency Injection
    val badSystem:BadSystem = dependencyInversion.BadSystem()
    badSystem.saveToDB(file, url)
    badSystem.saveToDisk(file, dir)


}