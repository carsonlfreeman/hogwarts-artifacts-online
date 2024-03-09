package edu.tcu.cs.hogwartsartifactsonline.artifact;

public class ArtifactNotFoundExpection extends RuntimeException{
    public ArtifactNotFoundExpection(String id) {
        super("Could not find artifact with Id " + id + " :(");
    }
}
