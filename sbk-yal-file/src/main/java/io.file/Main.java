/**
 * Copyright (c) KMG. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.file;
import io.sbk.api.Storage;
import io.sbk.api.impl.SbkYal;
import io.sbk.exception.HelpException;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(final String[] args) {
        Storage device = new File();
        try {
            SbkYal.run(args, device.getClass().getPackage().getName(), "FILE", null);
            } catch (UnrecognizedOptionException | HelpException ex) {
                System.exit(2);
            }catch (ParseException | IllegalArgumentException | IOException |
                InterruptedException | ExecutionException | TimeoutException |
                InstantiationException | ClassNotFoundException | InvocationTargetException |
                NoSuchMethodException | IllegalAccessException ex) {
                ex.printStackTrace();
                System.exit(1);
            }
            System.exit(0);
        }
}

