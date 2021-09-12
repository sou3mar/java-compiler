/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 1998-2015  Gerwin Klein <lsf@jflex.de>                    *
 * All rights reserved.                                                    *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import java.io.*;

/**
 * Simple test driver for the java parser. Just runs it on some
 * input files, gives no useful output.
 */
public class JavaParser {

    public static void main(String argv[]) {

            try {
                System.out.println("Parsing [" + argv[0] + "]");
                Scanner s = new Scanner(new UnicodeEscapes(new FileReader(argv[0])));
                parser p = new parser(s);
                p.parse();

                System.out.println("No errors.");
            } catch (Exception e) {
                e.printStackTrace(System.out);
                System.exit(1);
            }
    }

}