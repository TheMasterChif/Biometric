// Biomini_UserInfoDlg.cpp : implementation file
//

#include "stdafx.h"
#include "Biomini_Demo.h"
#include "Biomini_UserInfoDlg.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#undef THIS_FILE
static char THIS_FILE[] = __FILE__;
#endif

/////////////////////////////////////////////////////////////////////////////
// CBiomini_UserInfoDlg dialog


CBiomini_UserInfoDlg::CBiomini_UserInfoDlg(CWnd* pParent /*=NULL*/)
	: CDialog(CBiomini_UserInfoDlg::IDD, pParent)
{
	//{{AFX_DATA_INIT(CBiomini_UserInfoDlg)
	m_strUserID = _T("");
	//}}AFX_DATA_INIT
}


void CBiomini_UserInfoDlg::DoDataExchange(CDataExchange* pDX)
{
	CDialog::DoDataExchange(pDX);
	//{{AFX_DATA_MAP(CBiomini_UserInfoDlg)
	DDX_Text(pDX, IDC_USER_ID, m_strUserID);
	DDV_MaxChars(pDX, m_strUserID, 10);
	//}}AFX_DATA_MAP
}


BEGIN_MESSAGE_MAP(CBiomini_UserInfoDlg, CDialog)
	//{{AFX_MSG_MAP(CBiomini_UserInfoDlg)
		// NOTE: the ClassWizard will add message map macros here
	//}}AFX_MSG_MAP
END_MESSAGE_MAP()

/////////////////////////////////////////////////////////////////////////////
// CBiomini_UserInfoDlg message handlers
