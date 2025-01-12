package com.gupaoedu.vip.file.controller;

import com.gupaoedu.mall.util.RespResult;
import com.gupaoedu.vip.file.ceph.FileHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ${留白}
 * @since 2025/1/15
 */
@RestController
@RequestMapping(value = "/file")
public class UploadController {

    @Autowired
    private FileHandler fileHandler;

    @Value("${cephurl}")
    private String cephurl;

    /**
     * 文件上传
     */
    @PostMapping(value = "/upload")
    public RespResult upload(MultipartFile file) throws IOException {
        //上传
        fileHandler.upload(file.getOriginalFilename(),file.getBytes());
        return RespResult.ok(cephurl+file.getOriginalFilename());
    }

    /**
     * 下载
     */
    @GetMapping(value = "/download/{filename}")
    public void download(@PathVariable String filename, HttpServletResponse response) throws IOException {
        //下载
        byte[] bytes = fileHandler.download(filename);
        //输出文件
        ServletOutputStream os = response.getOutputStream();
        os.write(bytes);
    }
}

