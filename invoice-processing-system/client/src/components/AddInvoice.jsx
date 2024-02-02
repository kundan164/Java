
import { Box, Typography, TextField, styled } from "@mui/material";
import { Button } from "@mui/material";
import { useState } from "react";
import { saveInvoice } from '../services/api';

const Component = styled(Box)({
    marginTop: 20,
    '& > p': {
        fontSize: 26,
        marginBottom: 10
    },
    '& > div > div': {
        marginRight: 20,
        minWidth: 200
    }
})

const defaultObj = {
    vendor: '',
    product: '',
    amount: 0,
    date: '',
    action: 'pending'
}

const AddInvoice = () => {
    const [invoice, setInvoice] = useState(defaultObj)

    const onValueChange = (e) => {
        setInvoice({ ...invoice, [e.target.name]: e.target.value });
    }

    const addNewInvoice = async () => {
        await saveInvoice({ ...invoice, amount: Number(invoice['amount']) });
    }

    return (
        <Component>
            <Typography>Add Invoice</Typography>
            <Box>
                <TextField
                    variant="standard"
                    placeholder="Enter vendor name"
                    onChange={(e) => onValueChange(e)}
                    name="vendor"
                />
                <TextField
                    variant="standard"
                    placeholder="Enter product name"
                    onChange={(e) => onValueChange(e)}
                    name="product"
                />
                <TextField
                    variant="standard"
                    placeholder="Enter amount (in Rs)"
                    type="number"
                    onChange={(e) => onValueChange(e)}
                    name="amount"
                />
                <TextField
                    variant="standard"
                    placeholder="Enter date"
                    type="date"
                    onChange={(e) => onValueChange(e)}
                    name="date"
                />
                <Button
                    variant="contained"
                    onClick={() => addNewInvoice()}
                >
                    Add Invoice
                </Button>
            </Box>
        </Component>
    )
}

export default AddInvoice;