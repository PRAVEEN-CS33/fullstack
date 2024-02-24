import React from 'react'
import PropeTypes from 'prop-types'

function AdminLayout({ Children }) {
  return (
    <div className='admin-layout'>
    <aside>
        {/* side-nav */}
    </aside>
    <main>
        {Children}
    </main>
    <footer>
        {/* footer */}
    </footer>
    </div>
  )
}

AdminLayout.propeTypes = {
  Children: PropeTypes.node.isRequired,
}

export default AdminLayout