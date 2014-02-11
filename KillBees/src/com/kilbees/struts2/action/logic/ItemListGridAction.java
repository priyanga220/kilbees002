package com.kilbees.struts2.action.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.kilbees.bussiness.model.DrugItem;
import com.kilbees.hibernate.idao.IItemDAO;
import com.kilbees.struts2.action.AbstractAction;

public class ItemListGridAction extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private IItemDAO itemDAO;
	
	// Your result List
		  private List<DrugItem>      gridModel;

		  // get how many rows we want to have into the grid - rowNum attribute in the
		  // grid
		  private Integer rows = 0;

		  // Get the requested page. By default grid sets this to 1.
		  private Integer page = 0;

		  // sorting order - asc or desc
		  private String sord;

		  // get index row - i.e. user click to sort.
		  private String sidx;

		  // Search Field
		  private String searchField;

		  // The Search String
		  private String searchString;

		  // Limit the result when using local data, value form attribute rowTotal
		  private Integer totalrows;

		  // he Search Operation
		  // ['eq','ne','lt','le','gt','ge','bw','bn','in','ni','ew','en','cn','nc']
		  private String searchOper;
		  
		  private boolean _search; // Filter Search 

		  

		// Your Total Pages
		  private Integer total = 0;

		  // All Records
		  private Integer records = 0;

		  private boolean loadonce = false;
		  private Map<String, Object> session;
		  private List<DrugItem> itemList;
		  //=======================

		  public String execute()
		  {


		    //Object list = session.get("gridUserDoclist");
		    //logger.info("------  "+list.toString());
		    //if (list != null)
		    //{
		    	///logger.info("Build new List from sessionxxxx");
		    	//myDocuments = (List<UserDocument>) list;
		    //}
		    //else
		    {
		      System.out.println("Build new List");
		      itemList = itemDAO.getItemList();
		      System.out.println("List Count  "+itemList.size());
		    }

		    if (sord != null && sord.equalsIgnoreCase("asc"))
		    {
		      //Collections.sort(myDocuments);
		    }
		    if (sord != null && sord.equalsIgnoreCase("desc"))
		    {
		      //Collections.sort(myDocuments);
		      //Collections.reverse(myDocuments);
		    }

		    // Count all record (select count(*) from your_custumers)
		    records = itemDAO.allItemCount();

		    if (totalrows != null)
		    {
		      records = totalrows;
		    }

		    // Calucalate until rows ware selected
		    int to = (rows * page);

		    // Calculate the first row to read
		    int from = to - rows;

		    // Set to = max rows
		    if (to > records) to = records;

		    if (loadonce)
		    {
		      if (totalrows != null && totalrows > 0)
		      {
		        setGridModel(itemList.subList(0, totalrows));
		      }
		      else
		      {
		        // All Custumer
		        setGridModel(itemList);
		      }
		    }
		    else
		    {
		      // Search Custumers
		      if (searchString != null && searchOper != null)
		      {
		    	  
		    	  System.out.println("This is the Search Strin  "+searchString );
			        /*int id = Integer.parseInt(searchString);
			        if (searchOper.equalsIgnoreCase("eq"))
			        {

				          List<DrugItem> cList = new ArrayList<DrugItem>();
				          DrugItem dItem;
						try 
						{
							dItem = userDocumentServiceImpl.findById(id);
							if (uDocument != null) cList.add(uDocument);
							setGridModel(cList);
						} 
						catch (ItemNotFoundException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
						catch (DataRetriveException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		
			          
			        }*/
			        
		      }
		      else
		      {
		    	  setGridModel(gettemSubset(itemList, from, to));
		      }
		      
		      if(_search) // filtering enebled
		      {
		    	  
		      }
		      
		    }

		    // Calculate total Pages
		    total = (int) Math.ceil((double) records / (double) rows);
		    
		    
		    System.out.println("final result "+gridModel.size() );
		    return SUCCESS;
		  }

		  public String loadJSON()
		  {
			  System.out.println("comes to grid exceute    ");
		    return execute();
		  }
		  
		  public String doAdvancedSearch()
		  {
			  return SUCCESS;
		  }

		  /**
		   * @return how many rows we want to have into the grid
		   */
		  public Integer getRows()
		  {
		    return rows;
		  }

		  /**
		   * @param rows
		   *          how many rows we want to have into the grid
		   */
		  public void setRows(Integer rows)
		  {
		    this.rows = rows;
		  }

		  /**
		   * @return current page of the query
		   */
		  public Integer getPage()
		  {
		    return page;
		  }

		  /**
		   * @param page
		   *          current page of the query
		   */
		  public void setPage(Integer page)
		  {
		    this.page = page;
		  }

		  /**
		   * @return total pages for the query
		   */
		  public Integer getTotal()
		  {
		    return total;
		  }

		  /**
		   * @param total
		   *          total pages for the query
		   */
		  public void setTotal(Integer total)
		  {
		    this.total = total;
		  }

		  /**
		   * @return total number of records for the query. e.g. select count(*) from
		   *         table
		   */
		  public Integer getRecords()
		  {
		    return records;
		  }

		  /**
		   * @param record
		   *          total number of records for the query. e.g. select count(*) from
		   *          table
		   */
		  public void setRecords(Integer records)
		  {

		    this.records = records;

		    if (this.records > 0 && this.rows > 0)
		    {
		      this.total = (int) Math.ceil((double) this.records / (double) this.rows);
		    }
		    else
		    {
		      this.total = 0;
		    }
		  }

		  /**
		   * @return an collection that contains the actual data
		   */
		  public List<DrugItem> getGridModel()
		  {
		    return gridModel;
		  }

		  /**
		   * @param gridModel
		   *          an collection that contains the actual data
		   */
		  public void setGridModel(List<DrugItem> gridModel)
		  {
		    this.gridModel = gridModel;
		  }

		  /**
		   * @return sorting order
		   */
		  public String getSord()
		  {
		    return sord;
		  }

		  /**
		   * @param sord
		   *          sorting order
		   */
		  public void setSord(String sord)
		  {
		    this.sord = sord;
		  }

		  /**
		   * @return get index row - i.e. user click to sort.
		   */
		  public String getSidx()
		  {
		    return sidx;
		  }

		  /**
		   * @param sidx
		   *          get index row - i.e. user click to sort.
		   */
		  public void setSidx(String sidx)
		  {
		    this.sidx = sidx;
		  }

		  public void setSearchField(String searchField)
		  {
		    this.searchField = searchField;
		  }

		  public void setSearchString(String searchString)
		  {
		    this.searchString = searchString;
		  }

		  public void setSearchOper(String searchOper)
		  {
		    this.searchOper = searchOper;
		  }

		  public void setLoadonce(boolean loadonce)
		  {
		    this.loadonce = loadonce;
		  }

		  public void setTotalrows(Integer totalrows)
		  {
		    this.totalrows = totalrows;
		  }
		  
		  public boolean is_search() {
				return _search;
			}

			public void set_search(boolean _search) {
				this._search = _search;
			}

			private List<DrugItem> gettemSubset(List<DrugItem> list, int fr, int to)
		  {
			  List<DrugItem> res = new ArrayList<DrugItem>();
			  res = list.subList(fr, to);
			  return res;
		  }

}
