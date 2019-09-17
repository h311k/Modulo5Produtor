package br.senac.rj.produtor.util;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class GeradorQrCode {
	
	public void geraQrCode(String mensagem, int largura, int altura, String caminho) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(mensagem, BarcodeFormat.QR_CODE, largura, altura);

        Path path = FileSystems.getDefault().getPath(caminho);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
}
