
OpenRefine Database Extension

This project is an extension for Google Refine that provides a way to import data from a sql database using JDBC.


INSTALL

1. Before installing this extension download Google Refine code from http://code.google.com/p/google-refine/source/checkout. 

2. Pull this extension's code into folder database under folder /extensions. 
For more information on how to write a Google Refine extensions and where to put the files see http://code.google.com/p/google-refine/wiki/WriteAnExtension

The folder structure should resemble this:
OpenRefine/
----------/extensions
--------------/database
------------------/module
------------------/src
------------------build.xml
------------------README (this file)

3. Update build.xml in folder /extensions with build and clean ant tasks for database:

<project name="google-refine-extensions" default="build" basedir=".">
    <target name="build">
        <echo message="Building extensions" />
        <ant dir="sample/" target="build" />
        <ant dir="jython/" target="build" />
        <ant dir="gdata/" target="build" />
        <ant dir="database/" target="build" />
    </target>
    
    <target name="clean">
        <echo message="cleaning extensions" />
        <ant dir="sample/" target="clean" />
        <ant dir="jython/" target="clean" />
        <ant dir="freebase/" target="clean" />
        <ant dir="gdata/" target="clean" />
        <ant dir="database/" target="clean" />
    </target>
</project>

4. If using Eclipse, make sure that you build project with ant

