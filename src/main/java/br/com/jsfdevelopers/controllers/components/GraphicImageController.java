package br.com.jsfdevelopers.controllers.components;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletContext;

@Named
@RequestScoped
public class GraphicImageController implements Serializable {

    private String imageBinaryData;

    public String getImageBinaryData() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();
        ServletContext sc = (ServletContext) externalContext.getContext();
        String s = sc.getRealPath("/WEB-INF/951.jpg");
        
        Path path = Paths.get(s);

        
        byte[] bytesArquivo = Files.readAllBytes(path);
        return Base64.getEncoder().encodeToString(bytesArquivo);
    }

    public void setImageBinaryData(String imageBinaryData) {
        this.imageBinaryData = imageBinaryData;
    }

}
