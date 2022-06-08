// MultiScannerDemo.h : main header file for the MULTISCANNERDEMO application
//

#if !defined(AFX_MULTISCANNERDEMO_H__8F6B9424_1174_4B93_8CC2_DE8980AB0DB2__INCLUDED_)
#define AFX_MULTISCANNERDEMO_H__8F6B9424_1174_4B93_8CC2_DE8980AB0DB2__INCLUDED_

#if _MSC_VER > 1000
#pragma once
#endif // _MSC_VER > 1000

#ifndef __AFXWIN_H__
	#error include 'stdafx.h' before including this file for PCH
#endif

#include "resource.h"		// main symbols

/////////////////////////////////////////////////////////////////////////////
// CMultiScannerDemoApp:
// See MultiScannerDemo.cpp for the implementation of this class
//

class CMultiScannerDemoApp : public CWinApp
{
public:
	CMultiScannerDemoApp();

// Overrides
	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CMultiScannerDemoApp)
	public:
	virtual BOOL InitInstance();
	//}}AFX_VIRTUAL

// Implementation

	//{{AFX_MSG(CMultiScannerDemoApp)
		// NOTE - the ClassWizard will add and remove member functions here.
		//    DO NOT EDIT what you see in these blocks of generated code !
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};


/////////////////////////////////////////////////////////////////////////////

//{{AFX_INSERT_LOCATION}}
// Microsoft Visual C++ will insert additional declarations immediately before the previous line.

#endif // !defined(AFX_MULTISCANNERDEMO_H__8F6B9424_1174_4B93_8CC2_DE8980AB0DB2__INCLUDED_)
