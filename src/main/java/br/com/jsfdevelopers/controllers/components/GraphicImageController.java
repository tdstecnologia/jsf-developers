package br.com.jsfdevelopers.controllers.components;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.Base64;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class GraphicImageController implements Serializable {

    private String imagemBytes;

    public String getImagemBytes() throws IOException {
        File file = new File(
                getClass().getClassLoader().getResource("nfsu-3.jpg").getFile()
        );

        byte[] bytesArquivo = Files.readAllBytes(file.toPath());
        return Base64.getEncoder().encodeToString(bytesArquivo);
    }

    public void setImagemBytes(String imagemBytes) {
        this.imagemBytes = imagemBytes;
    }

}
