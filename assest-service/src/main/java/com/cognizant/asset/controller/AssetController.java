package com.cognizant.asset.controller;

import com.cognizant.asset.dto.AssetDto;
import com.cognizant.asset.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assets")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @PostMapping
    public ResponseEntity<AssetDto> createAsset(@RequestBody AssetDto assetDto) {
        AssetDto created = assetService.createAsset(assetDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AssetDto> getAsset(@PathVariable Long id) {
        AssetDto asset = assetService.getAsset(id);
        return ResponseEntity.ok(asset);
    }

    @GetMapping
    public ResponseEntity<List<AssetDto>> getAllAssets() {
        List<AssetDto> assets = assetService.getAllAssets();
        return ResponseEntity.ok(assets);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AssetDto> updateAsset(@PathVariable Long id, @RequestBody AssetDto assetDto) {
        AssetDto updated = assetService.updateAsset(id, assetDto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAsset(@PathVariable Long id) {
        assetService.deleteAsset(id);
        return ResponseEntity.noContent().build();
    }
}
