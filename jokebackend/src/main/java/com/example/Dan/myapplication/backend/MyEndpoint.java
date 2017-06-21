/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.Dan.myapplication.backend;

import com.example.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.Dan.example.com",
                ownerName = "backend.myapplication.Dan.example.com",
                packagePath = ""))
public class MyEndpoint
{
    /**
     * A simple endpoint method that return a joke in String
     */
    @ApiMethod(name = "newJoke")
    public MyJoke getJoke()
    {
        MyJoke response = new MyJoke();
        response.setData(new Jokes().getJoke());

        return response;
    }

}
