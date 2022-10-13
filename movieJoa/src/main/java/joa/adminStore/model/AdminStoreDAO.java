package joa.adminStore.model;

import java.util.*;

public interface AdminStoreDAO {
	
	public int addProduct(AdminStoreDTO dto);
	public List<AdminStoreDTO> adminStoreList(Map map);
	public AdminStoreDTO adminStoreContent(int idx);
	public int adminStoreTotalCnt();
	public int adminStoreUpdate(AdminStoreDTO dto);
	public int adminStoreDelete(String pro_idx);
}
