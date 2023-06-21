import java.io.*;

public class Copy {
    /**
     * 
     * @param args[0] for sourcefil
     * @param args[1] for targetfile
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java Copy sourcefile targetfile");
            System.exit(1);
        }

        // check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exists");
            System.exit(2);
        }

        // check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        try (
                // create an input stream
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));

                // create an output stream
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));) {
            // continuously read a bye from input and write it to output
            int r, numberOfBytesCopied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte) r);
                numberOfBytesCopied++;
            }

            // display the file size
            System.out.println(numberOfBytesCopied + " bytes copied");
        }
    }

}