package com.agile.test;

import com.agile.api.APIException;
import com.agile.api.IAgileSession;
import com.agile.api.ICell;
import com.agile.api.IItem;
import com.agile.api.ItemConstants;
import com.agile.px.ICustomAction;
import com.agile.px.ActionResult;
import com.agile.api.IDataObject;
import com.agile.api.INode;

public class UpdateP2P3Attributes implements ICustomAction{

	public ActionResult doAction(IAgileSession session, INode actionNode, IDataObject object) {
		ActionResult outcome = null;
		try{
			IItem itemName = (IItem)object;
			System.out.println("Item Name>> " +itemName);
			System.out.println("Item Name>> " +itemName);
			System.out.println("Item Name>> " +itemName);
			System.out.println("Item Name>> " +itemName);
			
			ICell addDesc  = (ICell)itemName.getCell(ItemConstants.ATT_PAGE_TWO_TEXT11);
			addDesc.setValue("Modified Description");
			System.out.println(addDesc.getValue());
			
			ICell siteInfo = (ICell)itemName.getCell(ItemConstants.ATT_PAGE_THREE_TEXT01);
			siteInfo.setValue("Modified Site Info");
			System.out.println(siteInfo.getValue());
			outcome = new ActionResult(ActionResult.STRING, "PX Completed");
		}
		catch(APIException e){
			e.printStackTrace();
		}
		return outcome;
	}

}
