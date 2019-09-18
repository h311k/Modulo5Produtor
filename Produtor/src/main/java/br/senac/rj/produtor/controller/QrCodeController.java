package br.senac.rj.produtor.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.zxing.WriterException;

import br.senac.rj.produtor.util.GeradorQrCode;

@RestController
@RequestMapping("/gerador-qr-code")
public class QrCodeController {
	
	private static final String QR_CODE_IMAGE_PATH = "C:/temp/qrcode.png";
	
	@GetMapping("/getqrcode")
	@ResponseBody
	public String getQrCode(@RequestParam String mensagem, @RequestParam String largura, @RequestParam String altura) throws JsonProcessingException {
		GeradorQrCode geradorQrCode = new GeradorQrCode();
		try {
			geradorQrCode.geraQrCode(mensagem, Integer.valueOf(largura), Integer.valueOf(altura), QR_CODE_IMAGE_PATH);
		} catch (NumberFormatException | WriterException | IOException e) {
			e.printStackTrace();
		}
		
		return "qrcode.png";
	}

}
