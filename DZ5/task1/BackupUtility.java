/**
 * Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup
 * */


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupUtility {

    public static void backupFiles(String sourceDir) {
        File sourceDirectory = new File(sourceDir);
        File backupDirectory = new File(sourceDir + "/backup");


        if (!backupDirectory.exists()) {
            backupDirectory.mkdir();
        }

        if (sourceDirectory.exists() && sourceDirectory.isDirectory()) {
            File[] files = sourceDirectory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        try {
                            Path sourcePath = file.toPath();
                            Path backupPath = new File(backupDirectory, file.getName()).toPath();
                            Files.copy(sourcePath, backupPath, StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else {
            System.out.println("Provided path is not a valid directory.");
        }
    }

    public static void main(String[] args) {
        backupFiles("./");
    }
}
