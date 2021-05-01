package com.product.wavebird.CommonAPI.client;


import com.product.wavebird.CommonAPI.dto.FileDto;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="file-ms", fallbackFactory = FileServiceFallbackFactory.class)
public interface FileServiceClient {
    @GetMapping("/file/{fileId}")
    public FileDto getFileById(@PathVariable Long fileId);

    @DeleteMapping("/file/{fileId}")
    public FileDto deleteFileById(@PathVariable Long fileId);

}

class FileServiceFallbackFactory implements FallbackFactory<FileServiceClient>{

    @Override
    public FileServiceClient create(Throwable cause) {
        return new FileServiceClientFallback(cause);
    }
}

class FileServiceClientFallback implements FileServiceClient{
    Logger logger = LoggerFactory.getLogger(this.getClass());

    private final Throwable cause;

    public FileServiceClientFallback(Throwable cause) {
        this.cause =cause;
    }

    @Override
    public FileDto getFileById(Long fileId) {
        logger.error("File Not Found"+ fileId);
        return new FileDto();
    }

    @Override
    public FileDto deleteFileById(Long fileId) {
        logger.error("Error while deleting file "+fileId);
        return new FileDto();
    }
}
