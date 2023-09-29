/**
 * Copyright (c) KMG. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.gem;
import io.gem.api.impl.SbkGemYal;
import org.apache.commons.cli.ParseException;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.lang.reflect.InvocationTargetException;
import io.sbk.exception.HelpException;

public class Main {

    public static void main(final String[] args) {
        try {
            SbkGemYal.run(args, "GemYal", null, null);
            } catch (HelpException ex) {
                System.out.println(ex.toString());
                System.exit(1);
        } catch (ParseException | IllegalArgumentException | IOException |
                InterruptedException | ExecutionException | TimeoutException |  ClassNotFoundException |
                InvocationTargetException | InstantiationException | NoSuchMethodException |
                 IllegalAccessException ex) {
                ex.printStackTrace();
                System.exit(1);
            }
            System.exit(0);
        }
}

