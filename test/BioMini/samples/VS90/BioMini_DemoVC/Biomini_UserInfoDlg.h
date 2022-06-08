#if !defined(AFX_Biomini_USERINFODLG_H__44FE5C1D_A770_41B5_B282_7198837DC0C0__INCLUDED_)
#define AFX_Biomini_USERINFODLG_H__44FE5C1D_A770_41B5_B282_7198837DC0C0__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000
// Biomini_UserInfoDlg.h : header file
//

/////////////////////////////////////////////////////////////////////////////
// CBiomini_UserInfoDlg dialog

class CBiomini_UserInfoDlg : public CDialog
{
// Construction
public:
	CBiomini_UserInfoDlg(CWnd* pParent = NULL);   // standard constructor

// Dialog Data
	//{{AFX_DATA(CBiomini_UserInfoDlg)
	enum { IDD = IDD_Biomini_USER_INFO };
	CString	m_strUserID;
	//}}AFX_DATA


// Overrides
	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CBiomini_UserInfoDlg)
	protected:
	virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV support
	//}}AFX_VIRTUAL

// Implementation
protected:

	// Generated message map functions
	//{{AFX_MSG(CBiomini_UserInfoDlg)
		// NOTE: the ClassWizard will add member functions here
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_Biomini_USERINFODLG_H__44FE5C1D_A770_41B5_B282_7198837DC0C0__INCLUDED_)
