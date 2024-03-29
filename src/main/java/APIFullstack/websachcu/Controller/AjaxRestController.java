package APIFullstack.websachcu.Controller;

import APIFullstack.websachcu.Entity.Product;
import APIFullstack.websachcu.Models.ProductModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/ajaxrest")
public class AjaxRestController {
    @RequestMapping(
            value = "demo1",
            method = RequestMethod.GET,
            produces = {MimeTypeUtils.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> demo1(){
        try {
            ResponseEntity<String> responseEntity = new ResponseEntity<String>("Demo 1", HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return  new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(
            value = "demo2/{fullName}",
            method = RequestMethod.GET,
            produces = {MimeTypeUtils.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> demo1(
            @PathVariable("fullName") String fullName    ){
        try {
            ResponseEntity<String> responseEntity = new ResponseEntity<String>("Hi " + fullName, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return  new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(
            value = "demo3",
            method = RequestMethod.GET,
            produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<Product> demo3(){
        try {
            ProductModel productModel = new ProductModel();
            ResponseEntity<Product> responseEntity = new ResponseEntity<Product>(productModel.find(), HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return  new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(
            value = "demo4",
            method = RequestMethod.GET,
            produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Product>> demo4(){
        try {
            ProductModel productModel = new ProductModel();
            ResponseEntity<List<Product>> responseEntity = new ResponseEntity<List<Product>>(productModel.findAll(), HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return  new ResponseEntity<List<Product>>(HttpStatus.BAD_REQUEST);
        }
    }
}
