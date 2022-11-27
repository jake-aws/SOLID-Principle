import dependencyInversion.*


fun main() {

    val url = "Https://CloudStorage.com"
    val dir = "C:\\Users\\jake\\Downloads"
    val file = "Item.fileType"

//    Dependency Injection
    val uploadService = UploadService()
    val downloadService = DownloadService()
    val system = System(downloadService, uploadService)
    system.saveToDB(file, url)
    system.saveToDisk(file, dir)

//    Without Dependency Injection
    val badSystem = BadSystem()
    badSystem.saveToDB(file, url)
    badSystem.saveToDisk(file, dir)


}