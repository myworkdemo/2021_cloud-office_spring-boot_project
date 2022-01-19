package com.cloud.office.erp.purchaserequisitionmaterialinfo.service;

import java.util.List;
import java.util.Optional;
import com.cloud.office.erp.entity.PurchaseRequisitionMaterialInfo;

public interface PurchaseRequisitionMaterialInfoService {

	public PurchaseRequisitionMaterialInfo addPurchaseRequisitionMaterialInfo(PurchaseRequisitionMaterialInfo purchaseRequisitionMaterialInfo);

	public PurchaseRequisitionMaterialInfo updatePurchaseRequisitionMaterialInfo(PurchaseRequisitionMaterialInfo purchaseRequisitionMaterialInfo);

	public void deletePurchaseRequisitionMaterialInfo(Long purchaseRequisitionMaterialInfoId);

	public List<PurchaseRequisitionMaterialInfo> getAllPurchaseRequisitionMaterialInfo();

	public Optional<PurchaseRequisitionMaterialInfo> getPurchaseRequisitionMaterialInfoById(Long purchaseRequisitionMaterialInfoId);
}