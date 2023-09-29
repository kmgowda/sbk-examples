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
import io.sbk.api.impl.Sbk;
import org.apache.commons.cli.ParseException;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(final String[] args) {
        Storage device = new File();
        try {
            Sbk.run(args, "FILE", device.getClass().getPackage().getName(), null);
            } catch (ParseException | IllegalArgumentException | IOException |
                InterruptedException | ExecutionException | TimeoutException |
                InstantiationException | ClassNotFoundException | InvocationTargetException |
                NoSuchMethodException | IllegalAccessException ex) {
                ex.printStackTrace();
                System.exit(1);
            }
            System.exit(0);
        }
}

